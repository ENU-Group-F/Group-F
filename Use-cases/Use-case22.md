# USE CASE: 22 - top populated capital cities in region

## CHARACTERISTIC INFORMATION

### Goal in Context

As a branch manager, I want to produce a report showing me the TOP populated capital cities in the region,
so I can plan where to open new branches. For example 10 top cities.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*We know the region. Database contains current region population data.*

### Success End Condition

*A report is available for the Branch Manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Branch Manager*

### Trigger

*A request for region top capital population data is required by Corporate Planning.*

## MAIN SUCCESS SCENARIO

1. Corporate Planning requests population information for a given region.
2. Branch Manager captures name of region to get population information for.
3. Branch Manager extracts current population information for the region.
4. Branch Manager provides report for Corporate Planning.

## EXTENSIONS

3. **Region does not exist**
   1.Branch Manager informs Corporate Planning region is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0