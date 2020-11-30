call plug#begin()
 Plug 'jiangmiao/auto-pairs'
 "Plug 'junegunn/goyo.vim'
 Plug 'morhetz/gruvbox'
 Plug 'tmhedberg/matchit'
 Plug 'mattn/emmet-vim'
 Plug 'tpope/vim-repeat'
 Plug 'tpope/vim-surround'
 "Plug 'vimwiki/vimwiki'
 Plug 'tpope/vim-fugitive'
call plug#end()

let mapleader = " "
set autowrite
set cursorline
set hidden
set incsearch
set lazyredraw
set number relativenumber
set wildmenu
set wildmode=longest:full,full

" Java
	augroup Java
	  autocmd!
	  au BufNewFile,BufRead *.java set colorcolumn=80
	  au BufNewFile,BufRead *.java set expandtab
	  au BufNewFile,BufRead *.java set shiftwidth=4
	  au BufNewFile,BufRead *.java set softtabstop=4
	  au BufNewFile,BufRead *.java set tabstop=4
	augroup END
	
	let java_highlight_java_lang_ids=1
	let java_highlight_functions="style"
	let java_highlight_java_util=1
	hi javaParen ctermfg=blue guifg=#0000ff

" HTML
	augroup Java
	  autocmd!
	  au BufNewFile,BufRead *.html set colorcolumn=100
	  au BufNewFile,BufRead *.html set expandtab
	  au BufNewFile,BufRead *.html set shiftwidth=2
	  au BufNewFile,BufRead *.html set softtabstop=2
	  au BufNewFile,BufRead *.html set tabstop=2
	  au BufNewFile,BufRead *.html ab loremm Mussum Ipsum, cacilds vidis litro abertis. A ordem dos tratores não altera o pão duris. Atirei o pau no gatis, per gatis num morreus. Copo furadis é disculpa de bebadis, arcu quam euismod magna. Detraxit consequat et quo num tendi nada. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Quem manda na minha terra sou euzis! Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis. Quem num gosta di mim que vai caçá sua turmis!
	augroup END

" ColorScheme
	set background=dark
	set termguicolors
	let g:gruvbox_italic=1
	let g:gruvbox_invert_selection=0
	colorscheme gruvbox
