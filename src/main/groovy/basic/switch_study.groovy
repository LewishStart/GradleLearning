package basic
/**
 * switch
 */
def x = 1.23
def result
switch (x){
    case 'foo':
        result = 'foo'
        break
    case 'bar':
        result = 'bar'
        break
    case [1.23,4,5,6,'list']:
        result = 'list'
        break
    case 12..15:
        result = 'range'
        break
    case Integer:
        result = "Integer"
        break
    case BigDecimal:
        result = "BigDecimal"
        break
    default:
        result = ""

}
println result
/**
 * 循环
 */
//对范围的for循环
def sum = 0
for(i in 0..9)
    sum+=i
println sum
//对list的for循环
sum = 0
for(i in [0,1,2,3,4,5,6,7,8,9])
    sum+=i
println sum
//对map的循环
for (i in ['li':1,'lucy':2,'haha':3]){
    println "key=${i.key},value=${i.value}"
}

