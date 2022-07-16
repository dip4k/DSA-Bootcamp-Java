var maximumWealth = function (accounts) {
    let max = Number.MIN_SAFE_INTEGER;
    accounts.map((e) => {
        let sum = e.reduce((acc, el) => acc + el, 0);
        max = sum >= max ? sum : max;
        return sum;
    });
    return max;
};
