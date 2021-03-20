# USE CASE: 23 Find percentage population data(Continent)

## CHARACTERISTIC INFORMATION

### Goal in Context
As a location planner I need a report showing the population of people living in and outside cities for each continent, so I can plan where future sites could be based.

### Scope
*Company*

### Level

*Primary Task*

### Preconditions

*We know the continent. Database contains current continent level population data and city data.*

### Success End Condition

*A report is available for the location manager to complete their work.*

### Failed End Condition

*No report is produced.*

### Primary Actor

*Location Planner*

### Trigger

*A request for the population breakdown in a continent is requested by the Location manager.*

## MAIN SUCCESS SCENARIO


1. Manager requests population breakdown for a particular continent.
2. Planner captures name of continent to get population information for.
3. Planner extracts current population breakdown for the continent.
4. Planner provides report for Manager.

## EXTENSIONS

3. **Continent does not exist**
   1.Planner informs manager continent is incorrect.

## SUB-VARIATIONS

*None*

## SCHEDULE

**DUE DATE**: Release 1.0