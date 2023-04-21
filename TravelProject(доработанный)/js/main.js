const owl = $('.owl-carousel');
owl.owlCarousel({
    center: true,
	loop: true,
	margin: 20,
	startPosition: 0,
	items: 1,
	responsive: {
		540: {
			items: 3,
			startPosition: 1,
		},
		1200: {
			items: 3,
			margin: 30,
		},
	},
});
$('.slider__btn--prev').click(function() {
    owl.trigger('prev.owl.carousel');
})
$('.slider__btn--next').click(function() {
    owl.trigger('next.owl.carousel');
})

const navBtn = document.querySelector('.nav__toggle');
const menuIcon = document.querySelector('.menu-icon');
const nav = document.querySelector('.nav');

navBtn.onclick = function(){
    nav.classList.toggle('nav--mobile');
    menuIcon.classList.toggle('menu-icon-active');
    document.body.classList.toggle('no-scroll');
}

var backgrounds = [
	"#4E5754",
	"#A5A5A5",
	"#428e5f"
];

document.body.style.background = backgrounds[Math.floor(Math.random() * (backgrounds.length + 1))];
