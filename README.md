# Gradle Git Hooks Example

The purpose of this example is to showcase the use of git hooks.
As git hooks cannot be pushed because they reside in the .git folder which is ignores by git,
the pre-commit script hook is in the `hooks` folder.

To make the pre-commit git hook work copy the `hooks/pre-commit` script into `.git/hooks` folder

To skip the pre-commit hook use:

```bash
$ git commit -n ...rest of options
```