/*

┌────────────────────────────────────────────────────────
│           Stack                            │
├──────────────────────────────────────────────────────── 
│ gerente → referencia a obj Gerente         │
│ dev     → referencia a obj Desarrollador   │
│ dis     → referencia a obj Diseñador       │
│ lista   → referencia a List<Empleado>      │
└───────────────────────────────────────────────────────┘

┌──────────────────────────────────────────────────────────────
│              Heap (objetos)                     │
├──────────────────────────────────────────────────────────────
│ Objeto tipo: Gerente                            │
│ - nombre: "Laura"                               │
│ - salarioBase: 5000                             │
│ - calcularSalario()  7000                       │
├────────────────────────────────────────────────────────────── 
│ Objeto tipo: Desarrollador                      │
│ - nombre: "Carlos"                              │
│ - salarioBase: 4000                             │
│ - calcularSalario()  4600                       │
├─────────────────────────────────────────────────────────────
│ Objeto tipo: Diseñador                          │
│ - nombre: "Ana"                                 │
│ - salarioBase: 3500                             │
│ - calcularSalario()  3850                       │
└─────────────────────────────────────────────────────────────┘


 */