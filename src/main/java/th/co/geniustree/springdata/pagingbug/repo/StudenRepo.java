/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.springdata.pagingbug.repo;

import java.io.Serializable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import th.co.geniustree.springdata.pagingbug.Student;

/**
 *
 * @author pramoth
 */
public interface StudenRepo extends JpaRepository<Student, Integer>{
    @Query("select s.fname,s.lname from Student s")
    Page<Object> findWithScalarSelect(Pageable pageable);
}
