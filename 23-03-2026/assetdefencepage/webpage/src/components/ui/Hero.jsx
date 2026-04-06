function Hero() {
  return (
<section className="bg-black text-white min-h-[80vh] flex flex-col justify-center backdrop-blur-xl shadow-2xl border border-white rounded-[40px] px-20 py-20 mx-5 mt-5">
<div className="flex justify-around items-center pt-20 text-2xl text-white">
        <div>💠Cortex</div>
        <div className="pt-20">Unlock your Asset Spark!</div>
        <div>💠Quant</div>
      </div>

      <div className="flex flex-col justify-center items-center pt-10 text-white">
        <div className="text-6xl">
          <strong>One-click for Asset Defence</strong>
        </div>
        <div className="mt-3 text-2xl">
          Dive into the art assets, where innovative blockchain technology meets
          financial expertise
        </div>
      </div>

      <div className="flex justify-center gap-20 p-10 text-white">
        <div className="border rounded-full px-2.5 py-1">Open App ↗️</div>
        <div className="border rounded-full px-8.5 py-1 bg-white text-black">Discover</div>
      </div>
    </section>
  );
}
export default Hero;
