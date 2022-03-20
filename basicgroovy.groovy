// variable decaraltions. 
// String, int, float, double, ClassNames
def mystring = "Hello"
println(mystring)

/*
def myfloat = 5.6
println(" Float value is " + myfloat/2)

// if statements. 
if (mystring = "hello") {
    println("Hello")

}
else if (mystring == "namasthe") {
    println("Namasthe")
}
else {
    println("Something else")
}

// while and for
i = 10
j = 0
while ( j < 10) {
    println(j)
    j = j + 1
} 
for ( i = 0 ; i <= 10; i++) {
    println("i = ${i}")
}

// dictionaries and arrays 
planets = [
        "mercury", 
        "venus"
]
for (planet in planets) {
    println(planet)
}
// functions . 
*/
def myFunc(a, b, operation) {
    println(operation(a,b))
}

// clousre. 
/*
    def add(a, b) {
        return a + b
    }
    add = { 
        a, b -> 
            a + b // last expression is the return value. 

    }
*/
def add = { a, b -> 
    a + b
}

myFunc(4,2, add)
myFunc(5,7) {
    c, d -> 
        c + d
}

def person = [
    name : "Arvind",
    TaxPayer: 345666
]

println(person['name'])

// closures. 

def myadd(a, b) {
        println("a = " + a)
        println("b = " + b)
}
def myhashmap = [name: 'hostname', defaultValue: 'gabor-dev', description: 'Hostname or IP address']
println(myhashmap['name'])
