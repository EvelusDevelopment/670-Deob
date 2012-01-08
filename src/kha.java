
final class kha {

   static int c;
   static int d;
   static int e;
   static int g;
   static int a;
   static int h;
   private Object[] b;
   static int f;


   static final Object[] a(int var0, Object[] var1, byte var2, Object[] var3) {
      if(var2 <= 0) {
         a(-14, (Object[])null);
      }

      ++d;
      lra.a(var1, 16830, var0, var3);
      return var1;
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      dra.a((Object[])((Object[])var0[8]), false, 0L);
      mm.a((Object[])((Object[])var0[8]), 0L, (byte)62);
      ((Object[])((Object[])var0[8]))[82] = null;
      ((boolean[])((boolean[])var0[6]))[0] = false;
      sj.a((Object[])((Object[])var0[8]), (byte)96, (int)1);
      ah.a((Object[])((Object[])var0[8]), (Object[])null, (byte)111);
      if(var1 > -48) {
         a(119, (Object[])null);
      }

      sj.a((Object[])((Object[])var0[8]), (byte)111, (int)0);
      ah.a((Object[])((Object[])var0[8]), (Object[])null, (byte)103);
   }

   kha(Object[] var1) {
      this.b = var1;
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++h;
      if(null == var3[0]) {
         var3[0] = nb.a((byte)58, ((int[])((int[])var3[1]))[0], new Object[5]);
      }

      if(var2 != 31439) {
         a((Object[])null, ((boolean[])((boolean[])((Object[])((Object[])var3[5]))[9]))[7]);
      }

      ma var4;
      Object[] var6 = (var4 = (ma)pm.a((long)var0, (Object[])((Object[])var3[0]), false)) == null?null:var4.s;
      if(var6 == null) {
         var6 = ps.a((byte)-34, var1, new Object[2]);
         di.a((Object[])((Object[])var3[0]), true, (lm)(null == var6?null:var6[0]), (long)var0);
      } else {
         ((int[])((int[])var6[1]))[0] = var1;
      }

   }

   protected final void finalize() throws Throwable {
      ++e;
      Object[] var1 = this.b;
      if(var1[2] != null) {
         System.out.println("");
         it.a(var1, false);
      }

   }

   static final long a(Object[] var0, boolean var1) {
      ++f;
      return var1?-69L:((rqa)var0[0]).a.b();
   }

   static final void a(int var0, Object[] var1) {
      ++c;
      nha.a((Object[])((Object[])var1[0]), 18806, 1);
      moa.a((byte)93, (Object[])null, (Object[])((Object[])var1[0]));
      el.a(8448, 30862, 8448, (Object[])((Object[])var1[0]));
      af.a(768, (Object[])((Object[])var1[0]), var0 ^ 29809, '\u8578', 1);
      db.a(var0, (Object[])((Object[])var1[0]), (byte)-68, 0, 5890);
      nha.a((Object[])((Object[])var1[0]), 18806, 0);
      af.a(768, (Object[])((Object[])var1[0]), var0 + 29809, '\u8578', 1);
   }

   static final Object[] a(boolean var0) {
      ++g;
      Object[] buffer = tia.createCskBuffer(-127);
      wb.putLong(buffer, 0L);
      bw.a(bm.f, (byte)0, buffer);
      if(!var0) {
         return (Object[])null;
      } else {
         wb.putLong(buffer, fw.b);
         wb.putLong(buffer, nca.e);
         mj.a(false, sd.a, ska.b, buffer);
         return buffer;
      }
   }

}
