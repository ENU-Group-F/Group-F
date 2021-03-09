# USE CASE: <number> <the name should be the goal as a short active verb phrase>

## CHARACTERISTIC INFORMATION

### Goal in Context

*As a global brand manager I want to produce a report showing me the top most populated countries in a region so I can identify target markets. For example, top three most populous countries in Central Africa.*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*We know the region. Database contains current regional population data.*

### Success End Condition

*A report is available for the brand manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Global Brand Manager*

### Trigger

*A request for regional population data is required by marketing.*

## MAIN SUCCESS SCENARIO


1. Marketing requests population information for a given region.
2. Brand Manager captures name of region to get population information for.
3. Brand Manager extracts current population information for the region.
4. Brand Manager provides report for marketing.

## EXTENSIONS

3. **Region does not exist**
    1.Brand Manager informs marketing region is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0