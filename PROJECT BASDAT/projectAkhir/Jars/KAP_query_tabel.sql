use KAP


create table login (
	username varchar(20) NOT NULL,
	password varchar(20) NOT NULL
);

create table auditor
	(no_auditor		varchar(14) NOT NULL,
	 nama			varchar(50) NOT NULL,
	 alamat			varchar(50) NOT NULL,
	 primary key (no_auditor)
	);

create table klien
	(ID			varchar(6) NOT NULL,
	nama		varchar(50) NOT NULL,
	alamat		varchar(25) NOT NULL,
	provinsi	varchar(25) NOT NULL,
	punya_NPWP	varchar(5) CHECK (punya_NPWP IN ('ya', 'tidak')) NOT NULL,
	no_npwp		varchar(23) NOT NULL,
	bidang_usaha varchar(25) NOT NULL,
	standar		varchar(10) NOT NULL,
	Jenis_LK	varchar(10) NOT NULL,
	kepemilikan varchar(15) NOT NULL,
	status		varchar(7) CHECK (status IN ('proses', 'selesai', 'batal')) NOT NULL,
	locked	varchar(5) CHECK (locked IN ('ya', 'tidak')) NOT NULL,
	primary key (ID),
	);

create table hasil_audit (
	ID_klien	varchar(6) NOT NULL, 
	no_LAI		varchar(50) NOT NULL,
	tgl_LAI		date NOT NULL,
	tahun_takwim	varchar(4) NOT NULL,
	go_publik	varchar(5) CHECK (go_publik IN ('ya', 'tidak')) NOT NULL,
	opini	varchar(3) NOT NULL,
	periode_awal date NOT NULL,
	periode_akhir date NOT NULL,
	restatement	varchar(5) CHECK (restatement IN ('ya', 'tidak')),
	no_restatement varchar(50),
	nama_ap_sebelumnya	varchar(50),
	tahun_ap_sebelumnya VARCHAR(4),
	keterangan	varchar(500),
	primary key (no_LAI),
	foreign key (id_klien) references klien(ID)
);

create table keuangan ( 
	code	varchar(36) NOT NULL,
	laba_rugi_bersih int,
	laba_sebelum_pajak int,
	fee_jasa int,
	beban_pajak int,
	pendapatan int,
	total_aset int,
	total_liabilitas int,
	jml_komprehensif int
	primary key (code)
);

create table afiliator (
	ID_afiliator varchar(6) NOT NULL,
	nama_afiliator varchar(50) NOT NULL,
	ID_klien varchar(6),
	no_LAI varchar(50)
	primary key(ID_afiliator),
	foreign key(ID_klien) references klien(ID),
	foreign key(no_LAI) references hasil_audit
);

create table files (
	ID_klien varchar(6) NOT NULL,
	no_LAI varchar(50) NOT NULL,
	file_LAI varchar(50),
	file_neraca varchar(50),
	file_calk varchar(50),
	file_labarugi varchar(50),
	file_arus_kas varchar(50),
	file_keterangan varchar(50),
	primary key (ID_klien),
	foreign key (ID_klien) references klien(ID),
	foreign key(no_LAI) references hasil_audit
);



