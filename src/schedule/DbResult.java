/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import java.sql.Timestamp;



/**
 *
 * @author Jorge
 */
 public class DbResult{

        public DbResult(int i, String n, Timestamp c, Timestamp d, String o) {
        
                id = i;
                nome = n;
                cre = c;
                due = d;
                obs = o;
        }
        
        public int id;
        public String nome;
        public Timestamp cre;
        public Timestamp due;
        public String obs;
        
    }
