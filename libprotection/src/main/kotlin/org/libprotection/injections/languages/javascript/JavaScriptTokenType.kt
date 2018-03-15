package org.libprotection.injections.languages.javascript

import org.libprotection.injections.languages.TokenType

enum class JavaScriptTokenType(val value: Int): TokenType {
    RegularExpressionLiteral(1),
    LineTerminator(2),
    OpenBracket(3),
    CloseBracket(4),
    OpenParen(5),
    CloseParen(6),
    OpenBrace(7),
    CloseBrace(8),
    SemiColon(9),
    Comma(10),
    Assign(11),
    QuestionMark(12),
    Colon(13),
    Dot(14),
    PlusPlus(15),
    MinusMinus(16),
    Plus(17),
    Minus(18),
    BitNot(19),
    Not(20),
    Multiply(21),
    Divide(22),
    Modulus(23),
    RightShiftArithmetic(24),
    LeftShiftArithmetic(25),
    RightShiftLogical(26),
    LessThan(27),
    MoreThan(28),
    LessThanEquals(29),
    GreaterThanEquals(30),
    Equals(31),
    NotEquals(32),
    IdentityEquals(33),
    IdentityNotEquals(34),
    BitAnd(35),
    BitXOr(36),
    BitOr(37),
    And(38),
    Or(39),
    MultiplyAssign(40),
    DivideAssign(41),
    ModulusAssign(42),
    PlusAssign(43),
    MinusAssign(44),
    LeftShiftArithmeticAssign(45),
    RightShiftArithmeticAssign(46),
    RightShiftLogicalAssign(47),
    BitAndAssign(48),
    BitXorAssign(49),
    BitOrAssign(50),
    NullLiteral(51),
    BooleanLiteral(52),
    DecimalLiteral(53),
    HexIntegerLiteral(54),
    OctalIntegerLiteral(55),
    Break(56),
    Do(57),
    Instanceof(58),
    Typeof(59),
    Case(60),
    Else(61),
    New(62),
    Var(63),
    Catch(64),
    Finally(65),
    Return(66),
    Void(67),
    Continue(68),
    For(69),
    Switch(70),
    While(71),
    Debugger(72),
    Function(73),
    This(74),
    With(75),
    Default(76),
    If(77),
    Throw(78),
    Delete(79),
    In(80),
    Try(81),
    Class(82),
    Enum(83),
    Extends(84),
    Super(85),
    Const(86),
    Export(87),
    Import(88),
    Implements(89),
    Let(90),
    Private(91),
    Public(92),
    Interface(93),
    Package(94),
    Protected(95),
    Static(96),
    Yield(97),
    Identifier(98),
    StringLiteral(99),
    WhiteSpaces(100),
    MultiLineComment(101),
    SingleLineComment(102),
    UnexpectedCharacter(103),
    Error(104);

    companion object {
        private val map = JavaScriptTokenType.values().associateBy(JavaScriptTokenType::value)
        fun fromInt(type: kotlin.Int) = map[type]!!
    }
}