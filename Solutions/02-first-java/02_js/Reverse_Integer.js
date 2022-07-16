var num = 23597;
var rem = (res = 0);

while (num != 0) {
    rem = num % 10;
    res = res * 10 + rem;
    num = parseInt(num / 10);
}

console.log(res);
