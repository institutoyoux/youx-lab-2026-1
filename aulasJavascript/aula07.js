// Operadores logicos
/*
&& -> and, e
|| -> or, ou
! -> not, não 
*/


//TABELA VERDADE
/* AND v.v = v
v.f = f
f.f = f 


AND 1.1 = 1
1.0 = 0
0.1 = 0
0. 0 = 0


OR v.v = v
v.f = v
f.v = v 
f.f = f 

OR 1.1 = 1
1.0 = 1
0.1 = 1
0.0 = 0
*/


let n1,n2,n3,n4
n1=10
n2=5
n3=15
n4=2

//console.log(!(n1>n2)||(n1>n3))

if(!( n1>n2)&&(n3>n4)){
    console.log("verdadeiro" )
}else{
    console.log("falso" )
}    