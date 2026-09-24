function findPalindromeBreaks(words) {
  // Guard rail: Return empty array if input is empty
  if (words.length === 0) {
    return [];
  }

  let breaks = [];

  // Loop through the words array using index pointer 'i'
  for (let i = 0; i < words.length; i++) {
    // If the word is NOT (!) a palindrome, collect its index position
    if (!isPalindrome(words[i])) {
      breaks.push(i);
    }
  }

  return breaks;
}
