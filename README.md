# demo_jpa_cascade_problem

When using cascade=PERSIST on a OneToMany relationship and you set the object id manually before calling repository.save

the OneToMany relationship is persisted with empty values
