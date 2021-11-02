CREATE TABLE IF NOT EXISTS Academic_Performance
(
    dossier_id INTEGER REFERENCES Dossier (id) ON DELETE CASCADE ON UPDATE CASCADE,
    lesson_id INTEGER REFERENCES Lessons (id) ON DELETE CASCADE ON UPDATE CASCADE,
    was_at_lesson BOOLEAN NOT NULL DEFAULT FALSE,
    homework_grade INTEGER CHECK(homework_grade >= 0),
    PRIMARY KEY (dossier_id, lesson_id)
);