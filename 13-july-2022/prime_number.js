let n = 100
let count = 0

while(n>2)
{
    n--;
    let  a = primeNumber(n);
    if(a==true)
    {
        console.log(n)
        count++;
    }
}

function primeNumber(n){
    let y = 1;
    while(n/2>y)
    {
        if(n==2)
        {
            return true;
        }
        y++;
        if(n%y == 0)
            return false;
    }
    return true;
}