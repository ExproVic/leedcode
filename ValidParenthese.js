/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  let stack = []
  let pairs = new Map([
    [')', '('],
    ['}', '{'],
    [']', '['],
  ])

  for (let char of s) {
    if (pairs.has(char)) {
      if (stack.length === 0 || stack.pop() !== pairs.get(char)) {
        return false
      }
    } else {
      stack.push(char)
    }
  }

  return stack.length === 0
}

console.log(isValid('()')) // true
console.log(isValid('()[]{}')) // true
console.log(isValid('(]')) // false
console.log(isValid('([)]')) // false
console.log(isValid('{[]}')) // true
