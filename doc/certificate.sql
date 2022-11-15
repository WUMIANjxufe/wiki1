drop table if exists certificate;
create table certificate (
       name varchar(250) comment '名称',
       time varchar(250) comment '工作时间',
       job varchar(250) comment '工作岗位',
       content varchar(250) comment '工作内容',
       primary key (name)
)engine = innodb default charset=utf8mb4 comment ='测试';
insert into certificate (name, time, job, content) VALUES ('吴冕','2022年9月23日--2022年9月27日','国家级教学成果奖申报项目《基于软件工厂的科创型IT骨干”三坊三化“培养模式探索与实践》（负责人：钟元生）申报材料工作组骨干','申报附件材料的收集与整理。该项目获江西省教育厅推荐申报2022年国家级教学成果奖');
insert into certificate (name, time, job, content) VALUES ('李浩轩','2022年9月23日--2022年9月27日','国家级教学成果奖申报项目《基于软件工厂的科创型IT骨干”三坊三化“培养模式探索与实践》（负责人：钟元生）申报材料工作组组长','申报附件材料的收集与整理。该项目获江西省教育厅推荐申报2022年国家级教学成果奖');
insert into certificate (name, time, job, content) VALUES ('苏羽欣','2022年9月23日--2022年9月27日','国家级教学成果奖申报项目《基于软件工厂的科创型IT骨干”三坊三化“培养模式探索与实践》（负责人：钟元生）申报材料工作组骨干','申报附件材料的收集与整理。该项目获江西省教育厅推荐申报2022年国家级教学成果奖');
