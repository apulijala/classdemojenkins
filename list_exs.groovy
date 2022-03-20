import javax.swing.JTable

// sort the list.
def mylist = [14, 12, 13, 11]
println(mylist.sort().reverse())

// 2. Determine the effect of the expression [1, [2, [3, 4]]] .flatten(), 
// and then state whether flatten recurses through nested Lists.
origList = [1, [2, [3, 4]]]
def flattenlist = origList.flatten()
println(flattenlist)

// 3. Given two Lists [11, 12, 13, 14] and [13, 14, 15],
// how would we obtain the list of ite[11, 12, 13, 14]ms from the first that are not in the second, that is, [11. 12]?
mylist = [11, 12, 13, 14]
mylist1 = [13, 14, 15]
println(mylist.minus(mylist1))

// 4. A stack represents a last-in-first-out data structure, 
// where all the operations occur at the stack top. 
// The operations on a stack are (a) 
// PUSH: place a new item on the stack top; (b) 
// POP: removes the topmost item from the stack; and (c) TOP: deliver a copy of the topmost item.
// If a List is used to implement a stack with the stack 
// top denoted by the final element of the List, 
// then show how the stack operations can be realized as List operations.

def push_my_list(mylist, mynum) {
    mylist.add(mynum)
}

mylist1 =  [4, 10]
push_my_list(mylist1,101)
println(mylist1)

def pop_my_list(mylist, mynum) {
    mylist.removeAt(mylist.size()-1)
}
pop_my_list(mylist1,101)
println(mylist1)

/*
5. Given a Groovy List object referenced as table, describe which elements are referenced by:
    (a) table[0]
    (b) table[table.size()- 1]
    (c) table[table.size() .intdiv(2)] where there is (i) an odd number of items
    in the list and (ii) where there is an even number of items.) table[table.size() .intdiv(2)]
    where there is (i) an odd number of items in the list and (ii) where there is an even number of items.
*/


/*
6. Distinguish between the effects of the following two List expressions:
(a) table.sort().reverse()
(b) table.reverse().sort()
*/
def mytable = [
        78, 1019, 4 , -9, 11
]
println(mytable.reverse().sort())
def mytable1 = [
        78, 1019, 4 , -9, 11
]
println(mytable1.reverse().sort())

/*
7. Is the map names = ['Ken' : 'Barclay', 'John' : 'Savage', 'Ken' : 'Chisholm']
a valid construction in Groovy? What would the value of the expression names. Ken deliver?
*/
def names = ['Ken' : 'Barclay', 'John' : 'Savage', 'Ken' : 'Chisholm']
println(names["Ken"])

/*
8. Given the map divisors shown in Section 4.3, determine the effect of the following expressions:
(a) divisors.containsKey(8)
(b) divisors[6].sort()
*/



