266     type StringToNumber<T> = T extends `${infer N extends number}` ? N : never;
                                                                    ~


Error: node_modules/@types/lodash/common/object.d.ts:1026:46 - error TS1005: '?' expected.

1026         : K extends `${infer N extends number}` ? T[N]
                                                  ~


Error: node_modules/@types/lodash/common/object.d.ts:1026:51 - error TS2536: Type 'N' cannot be used to index type 'T'.

1026         : K extends `${infer N extends number}` ? T[N]
                                                       ~~~~


Error: node_modules/@types/lodash/common/object.d.ts:1031:46 - error TS1005: '?' expected.

1031         : K extends `${infer N extends number}` ? T[N]
                                                  ~


Error: node_modules/@types/lodash/common/object.d.ts:1031:51 - error TS2536: Type 'N' cannot be used to index type 'T'.

1031         : K extends `${infer N extends number}` ? T[N]
                                                       ~~~~


Error: node_modules/@types/lodash/common/object.d.ts:1041:46 - error TS1005: '?' expected.

1041         : K extends `${infer N extends number}`
                                                  ~



##[error]Bash exited with code '1'.
Finishing: Build Application
