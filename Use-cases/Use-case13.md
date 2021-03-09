# USE CASE: <number> <the name should be the goal as a short active verb phrase>

## CHARACTERISTIC INFORMATION

### Goal in Context

*As a marketing manager I want to produce a report showing me the top most populated cities in a continent,
so I can allocate marketing budgets.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*Continent is known. Number of cities to report is known. Database contains current continental population data.*

### Success End Condition

*A report is available for the Marketing Manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Marketing Manager*

### Trigger

*A request for continental population data is required by Head of Marketing.*

## MAIN SUCCESS SCENARIO

1. Head of Marketing requests population information for a number of the most populated cities in a continent.
2. Marketing Manager captures the continent and number of cities to get population information for.
3. Marketing Manager extracts current population for the required number of cities.
4. Marketing Manager provides report for Head of Marketing.

## EXTENSIONS

3. **Continent does not exist**
    1.Branch Manager informs Head of Marketing continent is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0