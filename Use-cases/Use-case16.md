# USE CASE: 16 Reporting the most populated cities, district

## CHARACTERISTIC INFORMATION

### Goal in Context

*As a marketing manager, I need to produce a report showing the top most populated cities in a district, so I can allocate marketing budgets.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*District is known. Number of cities to report is known. Database contains current population data.*

### Success End Condition

*A report is available for the Marketing Manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Marketing Manager*

### Trigger

*A request for most populated cities in a region data is required by Head of Marketing.*

## MAIN SUCCESS SCENARIO

1. Head of Marketing requests data for a number of the most populated cities in a district.
2. Marketing Manager captures the district and number of cities to get population information for.
3. Marketing Manager extracts report of the required number of cities.
4. Marketing Manager provides report for Head of Marketing.

## EXTENSIONS

3. **District does not exist**
   1.Branch Manager informs Head of Marketing that district is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0