package basic
/**
 * groovy中变量的类型对应java中的包装类
 */
/**
 * 强类型定义方式
 */
int x = 10
println x.class

double y = 3.14

println y.class

def x_1 = 11
println x_1.class
x_1 = "haha"
println x_1.class
/**
 * 弱类型定义方式
 */
def y_1 = 3.1214
println y_1.class

def name = "Android"
println name.class