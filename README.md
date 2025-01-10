# Scala Default Parameter Bug
This repository demonstrates a subtle bug related to default parameter values in Scala's auxiliary constructors. The primary goal is to highlight the difference in behavior between the standard constructor that initializes with the default value and the auxiliary constructor.
## Problem
The issue centers around how default parameter values are handled in auxiliary constructors (constructors that call another constructor). When using an auxiliary constructor, if the primary constructor lacks default values, the auxiliary constructor's default value might not behave as expected. The example code shows two classes; the first class uses default value in an auxiliary constructor, the second class uses default value in a standard constructor.