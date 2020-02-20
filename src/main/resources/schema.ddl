create schema public;

comment on schema public is 'standard public schema';

alter schema public owner to postgres;

create table if not exists transaction1
(
	id bigserial not null
		constraint transaction1_pk
			primary key,
	status text not null,
	created timestamp default now() not null
);

alter table transaction1 owner to sdvaradkin;

create table if not exists payload1
(
	id bigserial not null
		constraint payload1_pk
			primary key,
	payload text not null,
	transaction_id bigserial not null
		constraint payload1_payment1_id_fk
			references transaction1 (id)
				on update cascade on delete cascade
);

alter table payload1 owner to sdvaradkin;

create table if not exists payload2
(
	id bigserial not null
		constraint payload2_pk
			primary key,
	payload text not null
);

alter table payload2 owner to sdvaradkin;

create table if not exists transaction2
(
	id bigserial not null
		constraint transaction2_pk
			primary key,
	status text not null,
	created timestamp default now() not null,
	payload_id bigserial not null
		constraint transaction2_payload2_id_fk
			references payload2
				on update cascade on delete cascade
);

alter table transaction2 owner to sdvaradkin;

create table if not exists transaction3
(
	id bigserial not null
		constraint transaction3_pk
			primary key,
	status text not null,
	created timestamp default now() not null
);

alter table transaction3 owner to sdvaradkin;

create table if not exists payload3
(
	id bigserial not null
		constraint payload3_pk
			primary key,
	payload text not null
);

alter table payload3 owner to sdvaradkin;

