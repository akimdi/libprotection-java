package com.ptsecurity.libprotection.injections.languages.sql

import SQLLexer
import com.ptsecurity.libprotection.injections.languages.AntlrLanguageProvider
import com.ptsecurity.libprotection.injections.languages.Token
import com.ptsecurity.libprotection.injections.languages.TokenType
import org.antlr.v4.runtime.ANTLRInputStream

object Sql : AntlrLanguageProvider() {
    override fun convertAntlrTokenType(antlrTokenType: Int) =
            SqlTokenType.fromInt(antlrTokenType) ?: throw IllegalArgumentException("Unexpected token type: $antlrTokenType")

    override fun createLexer(text: String) = SQLLexer(ANTLRInputStream(text))

    override fun trySanitize(text: String, context: Token): String? {
        if (context.languageProvider is Sql) return trySqlEncode(text, context.type as SqlTokenType) ?: super.trySanitize(text, context)
        else throw IllegalArgumentException("Unsupported SQL island: {context}")
    }

    override fun isSafeToken(type: TokenType, text: String) = when (type as SqlTokenType) {
        SqlTokenType.NullLiteral,
        SqlTokenType.FilesizeLiteral,
        SqlTokenType.StartNationalStringLiteral,
        SqlTokenType.StringLiteral,
        SqlTokenType.DecimalLiteral,
        SqlTokenType.HexadecimalLiteral,
        SqlTokenType.RealLiteral,
        SqlTokenType.NullSpecLiteral -> true
        else -> false
    }

    private fun trySqlEncode(text: String, tokenType: SqlTokenType) =
            if (tokenType == SqlTokenType.StringLiteral) text.replace("''", "'").replace("'", "''")
            else null
}