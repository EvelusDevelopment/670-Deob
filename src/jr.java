import java.io.IOException;

final class jr {

   static int c;
   static Object[] d = aqa.a(new Object[2], 31);
   static int b = 0;
   static int a;
   static int e;
   static int f;


   static final void a(Object[] var0, int var1, int var2) {
      ((int[])((int[])var0[1]))[3] -= var2;
      ++a;
      if(-1 < ~((int[])((int[])var0[1]))[var1]) {
         ((int[])((int[])var0[1]))[3] = 0;
      }

      if(null != var0[6]) {
         ((kp)var0[6]).a(var2);
      }

   }

   static final void a(byte var0, Object[] var1) {
      if(var0 != 106) {
         e = -102;
      }

      if(null == var1[0]) {
         var1[0] = new int[5];
      }

      ++c;
   }

   static final void a(Object[] var0, byte var1) {
      ++f;
      int var2 = 6 / ((-79 - var1) / 40);
      if(var0 == null) {
         throw new IllegalStateException();
      } else {
         if(var0[10] != null) {
            try {
               ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[0] = 0;
               ek.putByte((Object[])((Object[])var0[3]), 7);
               uk.put40BitInteger((Object[])((Object[])var0[3]), 0L);
               oua.writeBytesToOutputStreamWorker((Object[])((Object[]) var0[10]), (byte[])((byte[])((Object[])((Object[])var0[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var0[3]))[2])).length);
            } catch (IOException var6) {
               try {
                  qi.a((Object[])((Object[])var0[10]), (int)4);
               } catch (Exception var5) {
                  ;
               }

               var0[10] = null;
               ++((int[])((int[])var0[1]))[0];
               ((int[])((int[])var0[1]))[1] = -2;
            }
         }

      }
   }

}
