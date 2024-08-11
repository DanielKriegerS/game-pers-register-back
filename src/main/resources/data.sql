-- SKILLS SECTION

-- wizard skills
-- active wizard skill
INSERT INTO active_skill (id, name, skill_value) VALUES
('f47ac10b-58cc-4372-a567-0e02b2c3d479', 'Teleport', 5);

-- passive wizard skill
INSERT INTO passive_skill (id, name, skill_value) VALUES
('dce0f0d8-8f54-4d8a-bbe2-7c35a8ea2b3e', 'Magic Attack', 5);

-- magical wizard skill
INSERT INTO magic_skill (id, name, skill_value) VALUES
('a43e45b4-9a1b-4efc-b6d7-5c2b9e64f61a', 'Fireball', 5);

--
-- warrior skills
-- active warrior skill
INSERT INTO active_skill (id, name, skill_value) VALUES
('e16b18a7-f3b4-462e-b77f-d799e1e8b8e7', 'Critical Attack', 5);

-- passive warrior skill
INSERT INTO passive_skill (id, name, skill_value) VALUES
('7d16d26b-5d2b-42b8-91f0-3b45a68cbb6b', 'Sword Attack', 5);

-- magical warrior skill
INSERT INTO magic_skill (id, name, skill_value) VALUES
('b9a7641e-070d-4bfc-b6a2-98b44c2d78e6', 'Area Attack', 5);

--
-- long-distance skills
-- active long-distance skill
INSERT INTO active_skill (id, name, skill_value) VALUES
('24bdf5d4-6b67-47af-8732-03b29f3b4cf3', 'Explosive Arrow', 5);

-- passive long-distance skill
INSERT INTO passive_skill (id, name, skill_value) VALUES
('cc5b6b1c-8d72-4aef-9a23-3b26ef21b11e', 'Arrow Attack', 5);

-- magical long-distance skill
INSERT INTO magic_skill (id, name, skill_value) VALUES
('f7c20e8a-b4f4-4df1-888e-0c2d2a1f9fd6', 'Grenade Attack', 5);

-- TYPES SECTION
-- character types

-- wizard type
INSERT INTO pers_type (id, physical_strength, ranged_strength, combat_stance, active_skill_id, passive_skill_id, magic_skill_id) VALUES
('1a2b3c4d-5e6f-7a8b-9c0d-1e2f3a4b5c6d', 4, 6, 'wizard', 'f47ac10b-58cc-4372-a567-0e02b2c3d479', 'dce0f0d8-8f54-4d8a-bbe2-7c35a8ea2b3e', 'a43e45b4-9a1b-4efc-b6d7-5c2b9e64f61a');

-- warrior type
INSERT INTO pers_type (id, physical_strength, ranged_strength, combat_stance, active_skill_id, passive_skill_id, magic_skill_id) VALUES
('2b3c4d5e-6f7a-8b9c-0d1e-2f3a4b5c6d7e', 7, 2, 'warrior', 'e16b18a7-f3b4-462e-b77f-d799e1e8b8e7', '7d16d26b-5d2b-42b8-91f0-3b45a68cbb6b', 'b9a7641e-070d-4bfc-b6a2-98b44c2d78e6');

-- long-distance type
INSERT INTO pers_type (id, physical_strength, ranged_strength, combat_stance, active_skill_id, passive_skill_id, magic_skill_id) VALUES
('3c4d5e6f-7a8b-9c0d-1e2f-3a4b5c6d7e8f', 5, 7, 'long-distance', '24bdf5d4-6b67-47af-8732-03b29f3b4cf3', 'cc5b6b1c-8d72-4aef-9a23-3b26ef21b11e', 'f7c20e8a-b4f4-4df1-888e-0c2d2a1f9fd6');

-- equipments types

-- wizard type 1
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('c3b4a5d6-e7f8-9012-3456-7890abcdef23', 0, 0, 'magic_skill', 'active_skill', 1,'wizard');

-- wizard type 2
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('f1e2d3c4-b5a6-7890-1234-56789abcdef0', 10, 10, 'magic_skill', 'active_skill', 2,'wizard');

-- warrior type 1
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('f2e3d4c5-b6a7-8901-2345-6789abcdef45', 0, 0, 'magic_skill', 'active_skill', 1,'warrior');

-- warrior type 2
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('c9d8e7f6-a5b4-3210-9876-54321fedcba0', 10, 10, 'physical_strength', 'active_skill', 2, 'warrior');

-- long-distance type 1
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('a9b8c7d6-e5f4-3210-9876-54321fedcba7', 0, 0, 'magic_skill', 'active_skill', 1,'long-distance');

-- long-distance type 2
INSERT INTO equip_type (id, physical_strength, ranged_strength, principal_atribute, secundary_atribute, lv, combat_stance) VALUES
('e4d3c2b1-a5f6-7890-1e2d-3c4b5a6f7e8d', 10, 10, 'ranged_strength', 'active_skill', 2, 'long-distance');

-- npcs types

-- goblin type 1
INSERT INTO npctype (id, physical_strength, ranged_strength, combat_stance, lv, magic_defense) VALUES
('a2b3c4d5-e6f7-8901-2345-6789abcdef12', 30, 20, 'hand-to-hand', 1, 15);

-- goblin type 2
INSERT INTO npctype (id, physical_strength, ranged_strength, combat_stance, lv, magic_defense) VALUES
('d7e6f5a4-b3c2-1098-7654-3210fedcba98', 40, 30, 'hand-to-hand', 2, 20);

-- goblin type 3
INSERT INTO npctype (id, physical_strength, ranged_strength, combat_stance, lv, magic_defense) VALUES
('f8e9d0c1-b2a3-4567-8901-23456fedcba9', 55, 40, 'hand-to-hand', 3, 25);

-- boss type 1
INSERT INTO npctype (id, physical_strength, ranged_strength, combat_stance, lv, magic_defense) VALUES
('b0c1d2e3-f4a5-6789-0123-456789abcdef', 100, 65, 'long-distance', 1, 50);
--

-- EQUIPMENTS SECTION
--
-- warrior equipment basic
INSERT INTO equipments (id, name, equipment_type_id, equipment_value) VALUES
('d6e7f8a9-b0c1-2345-6789-01234abcdef5', 'Espada I', 'f2e3d4c5-b6a7-8901-2345-6789abcdef45', 10);

-- wizard equipment basic
INSERT INTO equipments (id, name, equipment_type_id, equipment_value) VALUES
('b7a8c9d0-e1f2-3456-7890-12345fedcba8', 'Cajado I', 'c3b4a5d6-e7f8-9012-3456-7890abcdef23', 10);

-- long-distance equipment basic
INSERT INTO equipments (id, name, equipment_type_id, equipment_value) VALUES
('f3e4d5c6-b7a8-9012-3456-7890abcdef67', 'Arco-e-flecha I', 'a9b8c7d6-e5f4-3210-9876-54321fedcba7', 10);

-- NPCs SECTION
--
-- goblin 1
INSERT INTO npcs (id, npcs_type_id) VALUES
('e8f9a0b1-c2d3-4567-8901-23456fedcba9', 'a2b3c4d5-e6f7-8901-2345-6789abcdef12');

-- goblin 2
INSERT INTO npcs (id, npcs_type_id) VALUES
('b1c2d3e4-f5a6-7890-1234-56789abcdef0', 'd7e6f5a4-b3c2-1098-7654-3210fedcba98');

-- goblin 3
INSERT INTO npcs (id, npcs_type_id) VALUES
('d9e8f7a6-b5c4-3210-9876-54321fedcba7', 'f8e9d0c1-b2a3-4567-8901-23456fedcba9');

-- boss 1
INSERT INTO npcs (id, npcs_type_id) VALUES
('f0e1d2c3-b4a5-6789-0123-456789abcdef', 'b0c1d2e3-f4a5-6789-0123-456789abcdef');