USE videoclub_pruebaud3;

SET AUTOCOMMIT=0;
INSERT INTO idioma VALUES (1,'English','2006-02-15 05:02:19'),
                          (2,'Italian','2006-02-15 05:02:19'),
                          (3,'Japanese','2006-02-15 05:02:19'),
                          (4,'Mandarin','2006-02-15 05:02:19'),
                          (5,'French','2006-02-15 05:02:19'),
                          (6,'German','2006-02-15 05:02:19');
COMMIT;


SET AUTOCOMMIT=0;
INSERT INTO pelicula VALUES (1,'ACADEMY DINOSAUR','A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies','2006-01-01',1,6,'0.99',86,'20.99','2006-02-15 05:03:42'),
                            (2,'ACE GOLDFINGER','A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China','2006-01-01',1,3,'4.99',48,'12.99','2006-02-15 05:03:42'),
                            (3,'ADAPTATION HOLES','A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory','2006-01-01',1,7,'2.99',50,'18.99','2006-02-15 05:03:42'),
                            (4,'AFFAIR PREJUDICE','A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank','2006-01-01',1,5,'2.99',117,'26.99','2006-02-15 05:03:42'),
                            (5,'AFRICAN EGG','A Fast-Paced Documentary of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico','2006-01-01',1,6,'2.99',130,'22.99','2006-02-15 05:03:42'),
                            (6,'AGENT TRUMAN','A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China','2006-01-01',1,3,'2.99',169,'17.99','2006-02-15 05:03:42'),
                            (7,'AIRPLANE SIERRA','A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat','2006-01-01',1,6,'4.99',62,'28.99','2006-02-15 05:03:42'),
                            (8,'AIRPORT POLLOCK','A Epic Tale of a Moose And a Girl who must Confront a Monkey in Ancient India','2006-01-01',1,6,'4.99',54,'15.99','2006-02-15 05:03:42'),
                            (9,'ALABAMA DEVIL','A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat','2006-01-01',1,3,'2.99',114,'21.99','2006-02-15 05:03:42'),
                            (10,'ALADDIN CALENDAR','A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China','2006-01-01',1,6,'4.99',63,'24.99','2006-02-15 05:03:42')
;
COMMIT;

SET AUTOCOMMIT=0;
INSERT INTO categoria VALUES (1,'Action','2006-02-15 04:46:27'),
(2,'Animation','2006-02-15 04:46:27'),
(3,'Children','2006-02-15 04:46:27'),
(4,'Classics','2006-02-15 04:46:27'),
(5,'Comedy','2006-02-15 04:46:27'),
(6,'Documentary','2006-02-15 04:46:27'),
(7,'Drama','2006-02-15 04:46:27'),
(8,'Family','2006-02-15 04:46:27'),
(9,'Foreign','2006-02-15 04:46:27'),
(10,'Games','2006-02-15 04:46:27'),
(11,'Horror','2006-02-15 04:46:27'),
(12,'Music','2006-02-15 04:46:27'),
(13,'New','2006-02-15 04:46:27'),
(14,'Sci-Fi','2006-02-15 04:46:27'),
(15,'Sports','2006-02-15 04:46:27'),
(16,'Travel','2006-02-15 04:46:27');
COMMIT;


SET AUTOCOMMIT=0;
INSERT INTO pelicula_categoria VALUES (1,6,'2006-02-15 05:07:09'),
(2,11,'2006-02-15 05:07:09'),
(3,6,'2006-02-15 05:07:09'),
(4,11,'2006-02-15 05:07:09'),
(5,8,'2006-02-15 05:07:09'),
(6,9,'2006-02-15 05:07:09'),
(7,5,'2006-02-15 05:07:09'),
(8,11,'2006-02-15 05:07:09'),
(9,11,'2006-02-15 05:07:09'),
(10,15,'2006-02-15 05:07:09');
COMMIT ;