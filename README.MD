# Refactor Exercise
The goal of this exercise is to help you improve your refactoring skills through: baby steps, small commits, and using TDD
to improve this repository. You need to refactor this project to reach the level that all requirements are satisfied
and, you consider the code good enough.

## What you should do?
- Refactor `LabelMapper` to return `UiLabel` instead of returning `UiLabel?`
- FeatureA, FeatureB and FeatureC should return `UiLabel` instead of returning `UiLabel?`
- Fix the bug presented in `LabelMapper`

### Requirements
- You can't do changes on FeatureA, FeatureB and FeatureC at the same time
- You should not create other mappers to map `Label` to `UiLabel`
- You can't use mocks
- Refactor `LabelMapper` to have only 1 public method
- Use TDD
- `LabelMapper` should always return soldOut label when `isSoldOut` is true
