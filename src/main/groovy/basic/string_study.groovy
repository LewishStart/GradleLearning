package basic
/**
 * 字符串定义方式
 */
//方式一
def name = 'a single string'
println name.class
//方式二
def sum = "The sum of 2 and 3 equals ${2 + 3}"
println sum
println sum.class
//GString String  可以相互传递，相互调用
String echo(String message) {
    return message
}

def result = echo(sum)
println result
//方式三
def thumpleName = '''three single string'''
println thumpleName.class
println thumpleName

/*
字符串的方法
 */
def str = "groovy"

println str.center(8,"a")

println str.getAt(0)
println str[0]
println str[0..1]


println "HelloWorld Groovy" - "Groovy"
println "HelloWorld Groovy".minus("Groovy")
println str.reverse()
println str.capitalize()
println str.isNumber()
println "33".isNumber()
println "33".toInteger()