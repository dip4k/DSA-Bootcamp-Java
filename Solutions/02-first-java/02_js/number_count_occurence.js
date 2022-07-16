var num = 456453425555653;
var rem = (res = 0);
var ocurence = 5;
while (num != 0) {
    rem = num % 10;
    if (rem === ocurence) {
        res++;
    }
    num = parseInt(num / 10);
    // console.log(num);
}

console.log(res);
