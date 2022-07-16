function armstrongBetweenTwoNumbers(start, end) {
    let armstrongNumbers = [];
    for (let i = start; i <= end; i++) {
        let copy = i;
        let pow = 0;
        // find power
        while (copy != 0) {
            copy = parseInt(copy / 10);
            ++pow;
        }
        // find sum of rem ^ pow
        let sum = (rem = 0);
        copy = i;
        while (copy != 0) {
            rem = copy % 10;
            sum += Math.pow(rem, pow);
            copy = parseInt(copy / 10);
        }

        if (sum === i) {
            armstrongNumbers.push(i);
        }
    }
    return armstrongNumbers;
}

console.log(armstrongBetweenTwoNumbers(10, 999999));
