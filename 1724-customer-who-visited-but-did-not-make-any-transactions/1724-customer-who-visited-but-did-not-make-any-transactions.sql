# Write your MySQL query statement below
select v.customer_id,count(v.visit_id)as count_no_trans
from visits v
left join Transactions T
on v.visit_id=T.visit_id
where t.transaction_id is null
group  by v.customer_id