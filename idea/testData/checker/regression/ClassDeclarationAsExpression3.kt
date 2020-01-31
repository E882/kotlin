// FIR_COMPARISON

fun f(i: Int = 3 < <error descr="[SYNTAX_ERROR] Syntax error"><error descr="[SYNTAX_ERROR] Syntax error">class A {
    fun f() {
        f()
    }
}</error></error>) {

}