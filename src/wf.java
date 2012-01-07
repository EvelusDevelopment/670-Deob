import java.util.zip.Inflater;

final class wf {

   static Object[] a = sd.a(new Object[1], 12, (byte)121);
   static int b;
   static int c;


   static final void a(long var0, int var2, Object[] var3, lm var4) {
      ++c;
      if(null != var4.d) {
         var4.a((byte)30);
      }

      lm var5 = ((lm[])((lm[])var3[2]))[(int)((long)(-1 + ((int[])((int[])var3[1]))[0]) & var0)];
      var4.f = var5;
      if(var2 <= -81) {
         var4.d = var5.d;
         var4.d.f = var4;
         var4.e = var0;
         var4.f.d = var4;
      }
   }

   static final void a(Object[] var0, Object[] var1, byte var2, byte[] var3) {
      try {
         ++b;
         if(-32 == ~((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0]] && ((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] + 1] == -117) {
            if(var0[0] == null) {
               var0[0] = new Inflater(true);
            }

            try {
               ((Inflater)var0[0]).setInput((byte[])((byte[])var1[2]), ((int[])((int[])var1[1]))[0] + 10, ((byte[])((byte[])var1[2])).length + (-((int[])((int[])var1[1]))[0] - 18));
               int var4 = 53 / ((77 - var2) / 44);
               ((Inflater)var0[0]).inflate(var3);
            } catch (Exception var5) {
               ((Inflater)var0[0]).reset();
               throw new RuntimeException("");
            }

            ((Inflater)var0[0]).reset();
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var6) {
         throw vt.a(var6, "wf.B(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

}
