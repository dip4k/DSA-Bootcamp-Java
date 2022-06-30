var num = 371;
var numCopy = num;
var rem = (res = 0);

while (num != 0) {
    rem = num % 10;
    res += Math.pow(rem, 3);
    // num = Math.trunc(num/10);
    num = parseInt(num/10);
    // num = (num/10)|0;
    // num = ~~(num/10);
    console.log(num + " : "+res);
}

if (res == numCopy) console.log(numCopy + " is an Armstrong number.");
else console.log(numCopy + " is not an Armstrong number.");
