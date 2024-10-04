/*

Which are the possible states of an issue? Created - waiting - assigned - resolved
What are the states of the transaction? Can customer only create issue at a specific state of transaction? Which all states are covered in unsuccessful transactions - skip transactions
Can CS have multiple expertise? Yes, addAgent has List of issueTypes
Do we need to assign issues based on expertise? Mentioned that we can assign to any agent - extensible
Can a agent handle multiple issues parallely? Is there a limit on how many issues can be handled parallely
What kind of filter do we want to have in getIssues? - generic
Do we want to support issue reopening? - no
Can we create multiple issues for a given transactionId / transactionId-issueType? - no
In what order we need to assign issues? Is there a priority or we do FCFS? - NA
How much is the scale? Exectution time of 4 sec is given - ignore

Enums
- issueType
- issueStatus

Entities
- customer
    - customerId
    - email (primary key)
    - List<Issues>
    - String phoneNumber
- issue
    - issueId (primary key)
    - transactionId
    - Status
    - IssueType
    - Subject
    - Description
    - Customer
    - CustomerAgent
- customerAgent
    - email
    - name
    - List<issueType>
    - List<Issues> active, closed

- Service
    - AgentService (Map<Agent, xyz> agents, Queue<Agent> availableAgents) - addAgent
    - IssueManagementService (Map<Issue, xyz> issues) - createIssue, assignIssue

Design pattern
- Builder
- Strategy - FilterStrategy, AssignmentStrategy - also use factory
- Observer


*/