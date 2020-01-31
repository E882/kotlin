// FIR_COMPARISON

val p = 1 < <error descr="[SYNTAX_ERROR] Syntax error"><error descr="[SYNTAX_ERROR] Syntax error">class A {
    fun f() {
        f()
    }
}</error></error>
