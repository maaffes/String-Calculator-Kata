# String-Calculator-Kata

String Calculator

Create a simple String calculator with a method int Add(string numbers). The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0). For example "" or "1" or "1,2".

Start with the simplest test case of an empty string and move to 1 and two numbers

Refactor after each passing test.

Allow the Add method to handle an unknown amount of numbers.

Allow the Add method to handle new lines between numbers (instead of commas). The following input is ok: "1\n2,3" (will equal 6). The following input is NOT ok: "1,\n" (not need to prove it - just clarifying).

Support different delimiters to change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]". For example, "//;\n1;2" should return three where the default delimiter is ';'. The first line is optional. All existing scenarios should still be supported.

Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed. If there are multiple negatives, show all of them in the exception message.
