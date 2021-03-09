# USE CASE: 21 - top populated capital cities in continent

## CHARACTERISTIC INFORMATION

### Goal in Context

*As a branch manager I want to produce a report showing me the top most populated capital cities in a continent,
so I can plan where to open new branches.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*We know the continent. Database contains current continental population data.*

### Success End Condition

*A report is available for the Branch Manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Branch Manager*

### Trigger

*A request for continental top capital population data is required by Corporate Planning.*

## MAIN SUCCESS SCENARIO

1. Corporate Planning requests population information for a given continent.
2. Branch Manager captures name of continent to get population information for.
3. Branch Manager extracts current population information for the continent.
4. Branch Manager provides report for Corporate Planning.

## EXTENSIONS

3. **Continent does not exist**
   1.Branch Manager informs Corporate Planning continent is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0