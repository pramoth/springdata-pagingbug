springdata-pagingbug
====================

demonstrate how paging with scalar select COUNT statement error.
-----------------------------------------------------------------
When use select with scalar & paging in Spring data JPA like below

@Query("select s.fname,s.lname from Student s")
    Page<Object> findWithScalarSelect(Pageable pageable);
    
    eclipselink will produce SQL that is not malform as below.

Syntax error parsing [select count(s.fname,s.lname) from Student s]. 
[29, 29] A select statement must have a FROM clause.
[20, 20] The right parenthesis is missing from the COUNT expression.
