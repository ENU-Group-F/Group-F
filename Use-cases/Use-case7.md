# USE CASE: <number> <the name should be the goal as a short active verb phrase>

## CHARACTERISTIC INFORMATION

### Goal in Context

*As an epidemiologist I need to produce a report which displays all of the cities in a particular district, organised by largest population to smallest*

### Scope

*Company*

### Level

*Primary Task*

### Preconditions

*We know the cities. Database contains current district population data.*

### Success End Condition

*A report is available for the epidemiologst to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Epidemiologist*

### Trigger

*A request for population data by city is required.*

## MAIN SUCCESS SCENARIO

1. A request is submitted for population information for cities within a particular district.
2. Epidemiologst captures name of district to get population information for.
3. Epidemiologst extracts current population information for the district.
4. Epidemiologst provides report.

## EXTENSIONS

3. **Region does not exist**
    1. Epidemiologst informs finance region is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0