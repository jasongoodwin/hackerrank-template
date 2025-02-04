# hackerrank-template
Trying to build a better model for hackerrank work.
Hackerrank's editor is decent enough for solving small problems (eg you don't need to move around) but it's a pain to build test cases, and for a language like Scala, it's simply too slow to lean on tests for feedback, so if you get stuck trying to debug, the cycle times are too long to realistically turn in a solution on time.

It takes 6 seconds for an empty scala project to run.
If you have an hour to solve a project, you have 3600 seconds. If you just sat there and ran the tests in hackerrank, you would run 600 tests in an hour. For three problems, if you run each project's tests 50 times to get feedback, you'll use 25% of your time solely in running the tests. If you bump into issues, running the tests 150 times trying to iron out issues will mean you will have spent 30 minutes in waiting for test feedback. If you just use test watch, that time disappears and so does the context of waiting around for the feedback. Set the test running in a pane in the editor and just save the file to re-run the tests.

# "Run Code" Times in Hackerrank:

For an example solution, I collected run times when pretting the "Run Code" button to see how long the response times are. "Submit Code" times are similar, but will vary if it tests large inputs and you have inefficiencies.

| Language | Time |
| Scala | 6-8s |
| Java | 3-4s |
| C# | 3-5s |
| ruby | 3-4s |
| python3+pypy3 | 3s |

## Getting the Example Inputs and Expected Outputs
The one problem is that if you try to re-create the input in the editor from the problem, you'll be blocked from trying to copy the example (you can just take a screenshot and throw it in Claude to solve the problem anyway, but we're trying to do this without cheating, or this whole problem wouldn't exist as you'd have a perfect result!)

Instead what we're going to do is get the example code to compile by returning something simple in the input. And then there are "Download" buttons on the Input and Example output panes. 



## Scala template

Step 1: 
take the solution block and put it in main.
Personally I like to work in a split editor with the tests in another pane.
To start the test watcher run:

```
sbt '~test'
```

That'll boot up the test watcher.

# Guide to Doing Better Faster

## Non-Technicals Guidelines

Before you write the code down, ensure you have a clear path to understanding the problem well, and then tackling the solution.

0. No replacement for understanding algorithms and datastructures
If you need to brush up, take sedgewick's textbook or the princeton course on coursera and just blast through it again. It'll get you sharp with knowing which structure/algorithm to pick for the problem.

"When in doubt, use a map." 

You can always start with a naive solution and then improve it, although it's better to consider what you need to do to solve the problem early by reasoning about the solution space/time complexity.

2. Ensure you have a clear understanding of the problem.
 
As an example, a magic square problem where every row and column must equal the same number, you first must understand that there is a "correct solution" depending on the grid size. 

x x x 
x x x
x x x

Will have numbers 1,2,3,4,5,6,7,8,9
If you miss this part, you'll be far away from the solution. Adding these numbers up == 45, and diving them by the number of rows or columns will give you the answer: 15. So you must make the magic square with each row/column equalling 45. If you don't get the problem, trying to approach the code won't get you any closer to the solution. 

See: https://en.wikipedia.org/wiki/Magic_square

2. Ensure you have a clear and precise understanding of the inputs and expected outputs. Edge cases etc.

Check the types of inputs vs outputs, consider rolling over of integers etc.

If you're solving fizzbuzz and you're expected to solve for 1 to n where n is the input, inclusive, you need to ensure you have that criteria clearly defined of you'll waste time trying to understand why your solution isn't correct, even if you solved the problem correctly.

3. Language Cheat Sheet

Many of us are solving problems with GenAI most of the time these days, so we get rusty with language details. We might be offloading a lof of the coding details to our LLM "intermediate developer" and focusing on higher level design. Or we're polyglots switching between 10 different languages depending on the problems space. I might touch C#, Python, Scala and Rust for a month and then not see them for another 6 months. Putting together a quick "cheat sheet" of things like range declarations, match statements, for comprehensions etc for the language can help you avoid any syntax issues by referencing your little language example sheet.
