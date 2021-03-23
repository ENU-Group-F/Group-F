# USE CASE: 25 Find percentage population data(Countries)

## CHARACTERISTIC INFORMATION

### Goal in Context
As a location planner I need a report showing the population of people living in and outside cities for each country so I can plan where future sites could be based.

### Scope
*Company*

### Level

*Primary Task*

### Preconditions

*We know the country. Database contains current country level population data and city data.*

### Success End Condition

*A report is available for the location manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Location Planner*

### Trigger

*A request for the population breakdown in a country is requested by the Location manager.*

## MAIN SUCCESS SCENARIO


1. Manager requests population breakdown for a particular country.
2. Planner captures name of country to get population information for.
3. Planner extracts current population breakdown for the country.
4. Planner provides report for Manager.

## EXTENSIONS

3. **Country does not exist**
   1.Planner informs manager country is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0