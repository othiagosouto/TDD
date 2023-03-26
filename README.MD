# Refactor Exercise
The goal of this exercise is to practice TDD and refactoring skills.

## What you should do?
- Refactor `LabelMapper` to return `UiLabel` instead of returning `UiLabel?`
- FeatureA, FeatureB and FeatureC should return `UiLabel` instead of returning `UiLabel?`

### Requirements
- You can't do changes on FeatureA, FeatureB and FeatureC at the same time
- You can't use mocks
- `LabelMapper` should always return soldOut label when `isSoldOut` is true
