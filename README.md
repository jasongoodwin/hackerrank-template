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