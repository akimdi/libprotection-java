package com.ptsecurity.libprotection.injections.languages.url

import com.ptsecurity.libprotection.injections.languages.TokenType

internal enum class UrlTokenType: TokenType {
    Error,
    Scheme,
    AuthorityEntry,
    PathEntry,
    QueryEntry,
    Fragment,

    // Non-terminals
    AuthorityCtx,
    PathCtx,
    QueryCtx,
}