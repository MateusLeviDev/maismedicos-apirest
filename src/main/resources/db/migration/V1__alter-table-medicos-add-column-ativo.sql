alter table medico add ativo boolean default false;
update medico set ativo = true;