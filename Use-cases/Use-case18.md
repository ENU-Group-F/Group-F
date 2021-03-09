# USE CASE: 18  - Capital cities in the continent, population in descending order

## CHARACTERISTIC INFORMATION

### Goal in Context

*As a branch manager, I want to produce a report showing me ALL the capital cities in a 
continent organised by largest population to smallest, so I can plan where to open new branches.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*We know the capital cities. Database contains current capital continent cities population data.*

### Success End Condition

*A report is available for the Branch Manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Branch Manager*

### Trigger

*A request for list of continent capital cities population,in descending order data is required by Corporate Planning.*

## MAIN SUCCESS SCENARIO

1. Corporate Planning requests population information for all continent capital cities.
2. Branch Manager captures name of the city to get population information for.
3. Branch Manager extracts current population information for the capital cities.
4. Branch Manager provides report for Corporate Planning.

## EXTENSIONS

3. **City does not exist**
   1.Branch Manager informs Corporate Planning continent is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0